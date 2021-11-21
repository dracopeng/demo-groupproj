# demo-groupproj
This is for documenting my progress for group project.

### Spotbugs Issue #1517
[False negatives on DLS_OVERWRITTEN_INCREMENT](https://github.com/spotbugs/spotbugs/issues/1517)

**Assigned to:** xinp2@
  
**Reason for choosing this issue:** The Spotbugs project looks very useful to me. Since this issue seemed to have a false negative case, I thought this might be an good start to get familiar with the code base.

**Progress summary:**
For the first a few weeks, I was struggled with my computer set up. I was using Windows and it was not very convenient for coding. After I started using VM, I first forked Spotbugs repo so that I can use it as my own repo: https://github.com/dracopeng/spotbugs
Then I use git cloned it to my VM and I can see it in VSCode as follows:
![image](https://user-images.githubusercontent.com/62916853/142748542-f8cc09e2-79a1-43fd-926e-38b782637845.png)

To use spotbugs:
Under spotbugs repo, I use `./gradlew` to build Spotbugs. 
Then use `./gradlew assembleDist` to assemble and ready to use.
Go inside spotbugs folder using following commands:
`cd spotbugs/build/distributions/`
Under this folder, I use `unzip spotbugs-4.4.3-SNAPSHOT.zip` and then `cd spotbugs-4.4.3-SNAPSHOT/lib`.
There is a file named as `spotbugs.jar` and this is the program I use to run.
For example I use this under my demo1 project to run spotbugs.
`java -jar ~/spotbugs/spotbugs/build/distributions/spotbugs-4.4.3-SNAPSHOT/lib/spotbugs.jar -textui ~/demo1/target/ > spotbugs.out`

For this issue 1517, the user reported a negative test case as follows:
void test00(){
    int i = 0;
    i = 2 + (i++); // no warning (false negative)'
}
So I have written this into `Spotbugs1517.java` to test.
Here's my `Spotbugs1517.java` file:
![image](https://user-images.githubusercontent.com/62916853/142751800-ec265e3c-ea73-4e51-a1f2-b81d2a0f8bb2.png)
After running Spotbugs and I checked the report
before:

![image](https://user-images.githubusercontent.com/62916853/142747752-b1de70d4-705a-4768-8ed6-29720c5110a9.png)

after:

![image](https://user-images.githubusercontent.com/62916853/142747770-142f732c-5e45-4e84-a3eb-326cf8925acc.png)

We can see that the warning for spotbugs1517 disappeared in the after picture.

**Tests Written:** Source code and commits history for the test can be found in this [repository](https://github.com/heeki/SampleJavaSdkV2).


### Spotbugs Issue #1518
[False negatives on RV_01_TO_INT](https://github.com/spotbugs/spotbugs/issues/1518)

**Assigned to:** xinp2@
  
**Reason for choosing this issue:** The Spotbugs project looks very useful to me. Since this issue seemed to have a false negative case, I thought this might be an good start to get familiar with the code base.

**Progress summary:**
For the first a few weeks, I was struggled with my computer set up. I was using Windows and it was not very convenient for coding. 

before:

![image](https://user-images.githubusercontent.com/62916853/142747752-b1de70d4-705a-4768-8ed6-29720c5110a9.png)

after:

![image](https://user-images.githubusercontent.com/62916853/142747770-142f732c-5e45-4e84-a3eb-326cf8925acc.png)


**Tests Written:** Source code for the preliminary client can be found in this [repository](https://github.com/heeki/SampleJavaSdkV2).
