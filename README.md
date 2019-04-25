# Junit Alone
#####

Use different classloaders for every test case.

## Compile
`
 mvn clean package
`

## Usage

maven:

```
<groupId>com.zhaoyanblog</groupId>  
<artifactId>junit-alone</artifactId>  
<version>1.0.0</version>
```
Replace Your Runner with AloneRunner.class, and put it to @AloneWith:

```
public class StaticClass {
    public static int staticNum = 0;
}

@RunWith(AloneRunner.class)
@AloneWith(JUnit4.class)
public class JunitAloneTest {
    @Test
    public void test() {
        StaticClass.staticNum++;
        Assert.assertEquals(1, StaticClass.staticNum);
    }
}
```
When you run with "mvn test" or junit suit,  The test case with "@RunWith(AloneRunner.class)" will use independent class 

# License
Copyright 2019, zhaoyanblog.com

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
