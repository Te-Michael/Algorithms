# Report for Assignment 1

## Project chosen

Name: williamfiset/Algorithms

URL: https://github.com/williamfiset/Algorithms

Number of lines of code and the tool used to count it: 31 kloc, lizard

Programming language: Java

## Coverage measurement

### Existing tool

The tool that was used was the built in Intellij Coverage tool. We used the tool on the entire tests folder.

<Show the coverage results provided by the existing tool with a screenshot>

![no alt](readMeImages/branch1img1.png)
# work by Michael Tedeev

### Your own coverage tool



Fuction name: push();

https://github.com/Te-Michael/Algorithms/commit/ae6de0d69f88bf22168d01f29e1e3aba0c443f8a
<Provide a screenshot of the coverage results output by the instrumentation>
![no alt](readMeImages/branch1img2.png)
<br>
Fuction name: floydWarshall();

https://github.com/Te-Michael/Algorithms/commit/95981628cbf280dfe113873be1c339e3bb7ea790
![no alt](readMeImages/branch2img1.png)
## Coverage improvement

### Individual tests

<The following is supposed to be repeated for each group member>

<Group member name>

testPush();<br>
![no alt](readMeImages/testPush.png)
<br>
https://github.com/Te-Michael/Algorithms/commit/ae6de0d69f88bf22168d01f29e1e3aba0c443f8a

old coverage:
<br>
![no alt](readMeImages/branch1img2.png)
<br>
new coverage:
![no alt](readMeImages/branch1img3.png)
<br>
<br><br>
The reason the coverage was improved was due to the implementation of testPush for arrayStack. When the stack reached 16 it is supposed to double in capacity. However, nothing was testing that clause. The function testPush tests that case, and hence covers it. it goes from 2/3rds covered to 3/3rds covered
<br><br>
testNegativeCycle(); 
<br>
![no alt](readMeImages/testNegativeCycle.png)

https://github.com/Te-Michael/Algorithms/commit/95981628cbf280dfe113873be1c339e3bb7ea790
<br>
old coverage:
<br>
![no alt](readMeImages/branch2img1.png)
<br>
new coverage:<br>
![no alt](readMeImages/branch2img2.png)
<br>
The coverage here was improved due to the implementation of testNegativeCycle(); In the source code, there is a special case if the MST-like datastructure has a negative cycle as that would invalidate the measurment. So my test covers that , whereas before it wasnt covered. The coverage goes from 1/3rd to 3/3rds
<br>
# work by Oliwer Dembicki
## Coverage measurement


### Your own coverage tool

Fuction name: slopePointToLine();

https://github.com/Te-Michael/Algorithms/commit/f4a8a3451debcaecc1d3eb70e4c042a0c33c6388
<Provide a screenshot of the coverage results output by the instrumentation>
![no alt](readMeImages/odbranch1beforeimprovement.jpeg)
<br>
<br>
Fuction name: binarySearch();

https://github.com/Te-Michael/Algorithms/commit/9da15378bceaedf5254d22cf15eaac09c679be1a
![no alt](readMeImages/odbranch2beforeimprovement.jpeg)
## Coverage improvement

### Individual tests

<The following is supposed to be repeated for each group member>

<Group member name>

lineTest();<br>
![no alt](readMeImages/odbranch1tests.jpeg)
<br>
<br>
https://github.com/Te-Michael/Algorithms/commit/f4a8a3451debcaecc1d3eb70e4c042a0c33c6388

old coverage:
<br>
<br>
![no alt](readMeImages/odbranch1beforeimprovement.jpeg)
<br>
<br>
new coverage:
<br>
<br>
![no alt](readMeImages/odbranch1afterimprovement.jpeg)
<br>
<br><br>
This function had no coverage at all before the implementation of lineTests. I had to create my own Class for testing and fill it myself. This was done with 3 tests, under normal (decided to test for positive instead of both negative and positive because that was enough for the tests), negative infinity and positive infinity assumptions. The tests basically check the behavior of the lines based on given slopes/assumptions and makes sure they behave correctly. These tests change the coverage from 0% 0/4 to 100% 4/4.
<br><br>
BinarySearchTest();
<br><br>
![no alt](readMeImages/odbranch2tests.jpeg)

https://github.com/Te-Michael/Algorithms/commit/9da15378bceaedf5254d22cf15eaac09c679be1a
<br>
<br>
old coverage:
<br>
<br>
![no alt](readMeImages/odbranch2beforeimprovement.jpeg)
<br>
<br>
new coverage:<br>
<br>
![no alt](readMeImages/odbranch2afterimprovement.jpeg)
<br>
<br>
The coverage in the function BinarySearch was improved with an introduction of the tests in BinarySearchTest(); We check coverage via specific cases mentioned in the main function like Square Root and Radius of a sphere. In, e.g. Square Root test we assume an outcome of result * result will be super close to the target value (using small epsilon). It is done in similar fashion in the Sphere Radius. Besides that we also check for the invalid bounds when the lo variable is greater or higher than the hi variable. Overall the tests cover different scenarios where the binary search algorithm is applied in different scenarios. This changes the coverage from 0/5 to 5/5, making it a 100%.
<br>

# work by Alun Arkananta
## Coverage measurement

### Your own coverage tool

<The following is supposed to be repeated for each group member>

<Group member name>

Function 1: isPrime

<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>

<Provide a screenshot of the coverage results output by the instrumentation>

Function 2: intersection()

<Provide the same kind of information provided for Function 1>

## Coverage improvement

### Individual tests

<The following is supposed to be repeated for each group member>

<Group member name>

<Test 1>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>

<Provide a screenshot of the old coverage results (the same as you already showed above)>

<Provide a screenshot of the new coverage results>

<State the coverage improvement with a number and elaborate on why the coverage is improved>

<Test 2>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>

Old coverage:
![aa2intellijcoverage1.png](readMeImages/aa2intellijcoverage1.png)
![aa2oldtest1.PNG](readMeImages/aa2oldtest1.PNG)
![aa2oldtest1-3.PNG](readMeImages/aa2oldtest1-3.PNG)
![aa2oldtest1-2.PNG](readMeImages/aa2oldtest1-2.PNG)
![aa2owncoveragetoolold.PNG](readMeImages/aa2owncoveragetoolold.PNG)

New coverage:
![aa2finalcoveragetest.jpg](readMeImages/aa2finalcoveragetest.jpg)
![aa2intellijcoverage2.jpg](readMeImages/aa2intellijcoverage2.jpg)
![aa2intellijcoverage3.jpg](readMeImages/aa2intellijcoverage3.jpg)
![aa2intellijcoverage4.jpg](readMeImages/aa2intellijcoverage4.jpg)

The coverage of the tests was increased from 0% to 100%. The intersection() function branched primarily to cover cases in
which lines were horizontal or vertical. If not, then a general formula was used to find the intersection. The tests thus 
focused on providing horizontal or vertical lines to achieve coverage in these branches. The normalise() function was also
called in intersection(), and itself also had an if condition that checked for a line with a b the was (close) to zero.
Lastly, we test to assert that non-horizontal/vertical lines return the expected intersection point. (0,0) was chosen for
simplicity.


# work by Hugo Sokolowski-Katzer
## Coverage measurement

### Your own coverage tool

< The following is supposed to be repeated for each group member>

< Group member name>

<Function 1 name>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the instrumented code to gather coverage measurements>

< Provide a screenshot of the coverage results output by the instrumentation>

<Function 2 name>

<Provide the same kind of information provided for Function 1>

## Coverage improvement

### Individual tests

< The following is supposed to be repeated for each group member>

< Group member name>

<Test 1>

<Show a patch (diff) or a link to a commit made in your forked repository that shows the new/enhanced test>

<Provide a screenshot of the old coverage results (the same as you already showed above)>

< Provide a screenshot of the new coverage results>

< State the coverage improvement with a number and elaborate on why the coverage is improved>

<Test 2>

<Provide the same kind of information provided for Test 1>

### Overall

<Provide a screenshot of the old coverage results by running an existing tool (the same as you already showed above)>

< Provide a screenshot of the new coverage results by running the existing tool using all test modifications made by the group>


## Statement of individual contributions

< describe what each group member did>

