using System.Collections;
using System.Collections.Generic;
using UnityEditor;
using UnityEngine;

public class obstacle : MonoBehaviour
{
    Vector3 moveRight;
    Vector3 moveLeft;
    bool goRight = true;

    float lastTimer = 0;
    [SerializeField] float timeDiff = 1;
    [SerializeField] float speed = 2;

    // Start is called before the first frame update
    void Start()
    {
        moveRight = new Vector3(0.1f, 0, 0);
        moveLeft = new Vector3(-0.1f, 0, 0);
        lastTimer = Time.time;
    }

    // Update is called once per frame
    void Update()
    {
        if (Time.time - lastTimer > timeDiff)
        {
            goRight = !goRight;
            lastTimer = Time.time;
        }
            

        transform.position += (goRight ? Vector3.right : Vector3.left) * Time.deltaTime * speed;
    }
}
