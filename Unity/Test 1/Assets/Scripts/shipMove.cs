using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class shipMove : MonoBehaviour
{

    Rigidbody rb;
    AudioSource ad;

    [SerializeField] float mainThrust = 5;
    [SerializeField] float mainRotate = 100;

    // Start is called before the first frame update
    void Start()
    {

        rb = GetComponent<Rigidbody>();
        ad = GetComponent<AudioSource>();
        
    }

    // Update is called once per frame
    void Update()
    {
        ProcessThrust();
        ProcessRotation();
    }

    void ProcessThrust()
    {
        if (Input.GetKey(KeyCode.Space))
        {
            //transform.(Vector3.forward * Time.deltaTime * mainThrust, 0, 0);
            rb.AddRelativeForce(Vector3.up * mainThrust, ForceMode.Acceleration);
            if (!ad.isPlaying)
            {
                ad.Play();
            }

        } else {
            if (ad.isPlaying)
            {
                ad.Stop();
            }
        }

        //if (Input.GetKey(KeyCode.W))
        //{
        //    rb.transform.Rotate(Vector3.forward * -1 * Time.deltaTime * mainThrust, 0, 0);

        //}

    }

    void ProcessRotation()
    {
        if (Input.GetKey(KeyCode.W))
        {
            rb.transform.Rotate(Vector3.right * Time.deltaTime * mainRotate, 0.1f, 0);
            //rb.AddRelativeForce(Vector3.right * mainRotate, ForceMode.Acceleration);

        }

        if (Input.GetKey(KeyCode.S))
        {
            rb.transform.Rotate(Vector3.left * Time.deltaTime * mainRotate, 0.1f, 0);
            //rb.AddRelativeForce(Vector3.left * mainRotate, ForceMode.Acceleration);

        }

    }


    private void OnCollisionEnter(Collision collision)
    {
        switch (collision.gameObject.tag)
        {
            case "Friendly":
                Debug.Log("Friendly object hit.");
                break;
            case "Finish":
                loadNextLevel();
                break;
            case "Start":
                Debug.Log("Start object hit.");
                //loadNextLevel();
                break;
            default: // anything else
                reloadLevel();
                break;
            
        }
    }

    public void reloadLevel()
    {
        Debug.Log("Reloaded Current Scene");
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex);
    }

    public void loadNextLevel()
    {
        Debug.Log("Loaded Next Scene");
        int sceneCount = SceneManager.sceneCountInBuildSettings;
        int currentSceneIndex = SceneManager.GetActiveScene().buildIndex;
        SceneManager.LoadScene((currentSceneIndex+1) > sceneCount ? 0 : (currentSceneIndex+1));
    }

}
