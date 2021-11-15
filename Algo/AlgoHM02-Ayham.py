#
#    Algorithm Homework 02
#    Name: Ayham Al-Ali
#    UID: 201910486
#    Date: 31/10/2021
#

# Question:
#      Write a code (in any language) to check the permutation of a sequence (array), you need to check if the numbers in the array are sorted ascendingly, and if there are no repetitions.
#      Examples for permutations:
#      1, 2, 3, 4, 5
#      4, 6, 7
#      11, 55, 77, 78, 79


# pre-defined list, change to test the code
# list = [1, 2, 3, 4, 5, 6, 6]; # duplicates
list = [1, 2, 3, 4, 5, 6, 5]; # ascending order

def runMe():
    for i in range(0, len(list)):
        if list[i] == list[i+1]:  # dupliates
            print("The list contains duplicates. (${list[i]} ${list[i+1]})")       
            return;
        elif list[i] > list[i+1]:
            print("The list is not in ascending order. (${list[i-1]} ${list[i]} ${list[i+1]})")       
            return;

runMe()