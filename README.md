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



Fuction 1 name: push();

https://github.com/Te-Michael/Algorithms/commit/ae6de0d69f88bf22168d01f29e1e3aba0c443f8a
<Provide a screenshot of the coverage results output by the instrumentation>
![no alt](readMeImages/branch1img2.png)
<br>
Fuction 2 name: floydWarshall();

https://github.com/Te-Michael/Algorithms/commit/95981628cbf280dfe113873be1c339e3bb7ea790
![no alt](readMeImages/branch2img1.png)
## Coverage improvement

### Individual tests

<The following is supposed to be repeated for each group member>

<Group member name>

test 1: testPush();<br>
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
test 2: testNegativeCycle(); 
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

Fuction 1 name: slopePointToLine();

https://github.com/Te-Michael/Algorithms/commit/f4a8a3451debcaecc1d3eb70e4c042a0c33c6388
<Provide a screenshot of the coverage results output by the instrumentation>
![no alt](readMeImages/odbranch1beforeimprovement.jpeg)
<br>
<br>
Fuction 2 name: binarySearch();

https://github.com/Te-Michael/Algorithms/commit/9da15378bceaedf5254d22cf15eaac09c679be1a
![no alt](readMeImages/odbranch2beforeimprovement.jpeg)
## Coverage improvement

### Individual tests

<The following is supposed to be repeated for each group member>

<Group member name>

test 1: lineTest();<br>
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
test 2: BinarySearchTest();
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

Function 1 name: isPrime()
https://github.com/Te-Michael/Algorithms/commit/094ae0ed94010054461d8d15bec99d3b5da3191f

![aa1primetestbefore.PNG](readMeImages/aa1primetestbefore.PNG)

Function 2 name: intersection()
https://github.com/Te-Michael/Algorithms/commit/51bde4e28931c187ed74179dd474cda7812ddb10

![aa2owncoveragetoolold.PNG](readMeImages/aa2owncoveragetoolold.PNG)

## Coverage improvement

### Individual tests

Test 1: PrimeTest() https://github.com/Te-Michael/Algorithms/commit/094ae0ed94010054461d8d15bec99d3b5da3191f <br>
![primetest.PNG](readMeImages/primetest.PNG)<br>

Old coverage:<br>
![aa1coveragebefore.PNG](readMeImages/aa1coveragebefore.PNG)
![aa1primetestbefore.PNG](readMeImages/aa1primetestbefore.PNG)

New coverage:<br>
![aa1coverageafter.PNG](readMeImages/aa1coverageafter.PNG)
![aa1primetestafter.PNG](readMeImages/aa1primetestafter.PNG)

The coverage was improved from 0% to 100%. The test is relatively simple, by giving numbers that are known to (not) be prime,
and checking the return value. The original file has a main() (not necessarily a test) function that runs the function to 
show the output, but all the numbers are prime and doesn't check for non-prime numbers. Regardless, coverage is assumed
to be zero as there was originally no test function in the test package.

Test 2: LineTest.testCoverage() https://github.com/Te-Michael/Algorithms/commit/51bde4e28931c187ed74179dd474cda7812ddb10 <br>
![linetest1.PNG](readMeImages/linetest1.PNG)
![linetest2.PNG](readMeImages/linetest2.PNG)<br>


Old coverage: <br>
![aa2intellijcoverage1.png](readMeImages/aa2intellijcoverage1.png)
![aa2oldtest1.PNG](readMeImages/aa2oldtest1.PNG)
![aa2oldtest1-3.PNG](readMeImages/aa2oldtest1-3.PNG)
![aa2oldtest1-2.PNG](readMeImages/aa2oldtest1-2.PNG)
![aa2owncoveragetoolold.PNG](readMeImages/aa2owncoveragetoolold.PNG)

New coverage: <br>
![aa2finalcoveragetest.jpg](readMeImages/aa2finalcoveragetest.jpg)
![aa2intellijcoverage2.jpg](readMeImages/aa2intellijcoverage2.jpg)
![aa2intellijcoverage3.jpg](readMeImages/aa2intellijcoverage3.jpg)
![aa2intellijcoverage4.jpg](readMeImages/aa2intellijcoverage4.jpg)

The coverage of the tests was increased from 0% to 100%. The intersection() function branched primarily to cover cases in
which lines were horizontal or vertical. If not, then a general formula was used to find the intersection. We test for 
the various conditions of each branch, which are mostly concerned  with the b and a values in the formula ax + by = c.The tests thus 
focused on providing horizontal or vertical lines to achieve coverage in these branches. The normalise() function was also
called in intersection(), and itself also had an if condition that checked for a line with a b the was (close) to zero.
Lastly, we test to assert that non-horizontal/vertical lines return the expected intersection point. (0,0) was chosen for
simplicity.

 

# work by Hugo Sokolowski-Katzer
## Coverage measurement
### Your own coverage tool
Function 1 name: mult()
<br>
https://github.com/Te-Michael/Algorithms/commit/90cfb1c6abe35cbc1a16b821d2a2fea467d2b227
<br>
![no alt](readMeImages/mult.png)
<br>
Function 2 name: getPerpBisector()
<br>
https://github.com/Te-Michael/Algorithms/commit/122523211956db409299cbc98d2229cf91ed905c
<br>
![no alt](readMeImages/bipBefore.png)
<br>
## Coverage improvement
### Individual tests

Test 1: testMultiply();
<br>
![no alt](readMeImages/multTest.png)
<br>
<https://github.com/Te-Michael/Algorithms/commit/90cfb1c6abe35cbc1a16b821d2a2fea467d2b227>
<br>
before:
<br>
![no alt](readMeImages/mult.png)
<br>
after:
<br>
![no alt](readMeImages/multAfter.png)
<br>
The coverage is now 75%, this is an improvement since previously the coverage was 0%, the improvement is due to the fact that the test now forces the function to access almost all of its branches by giving various different polynomials to calculate
<br>
<br>
Test 2: testGetPerpBisector();
<br>
![no alt](readMeImages/bipTest.png)
<br>
<https://github.com/Te-Michael/Algorithms/commit/122523211956db409299cbc98d2229cf91ed905c>
<br>
before:
<br>
![no alt](readMeImages/bipBefore.png)
<br>
After:
<br>
![no alt](readMeImages/bipAfter.png)
<br>
Here again the coverage started out at 0%, it is now 100%. This is because we created a test which provides two different pairs of points which force the function to traverse all its branches, the different points are necessary due to the branching conditions such as z < 0>
### Overall

old coverage:
<br>
![no alt](readMeImages/branch1img1.png)
<br>
final coverage:
<br>
![no alt](readMeImages/final coverage.png)
<br>

## Statement of individual contributions

the document clearly states which functions were done by whom via heading. 
but to summarise:
<br><br>
testPush(); - Michael Tedeev<br><br>
testNegativeCycle(); - Michael Tedeev<br><br>
some functions in the line class - Oliwer Dembicki<br><br>
BinarySearchTest(); - Oliwer Dembicki<br><br>
some functions in the line class - Alun Arkananta<br><br>
PrimeTest(); - Alun Arkananta<br><br>
testMultiply(); - Hugo Sokolowski-Katzer<br><br>
testGetPerpBisector(); - Hugo Sokolowski-Katzer<br><br>
For everything else such as pull-requests ,readme compilation, testing for coverage and lines everybody contributed hence it was a group effort