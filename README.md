# Matrix-Math
A simple java library for basic matrix math 

## Import the library

1. Add the repositories in the POM.xml file
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

2. And add the dependency below
```xml
<dependencies>
    <dependency>
        <groupId>com.github.Raf-rgb</groupId>
        <artifactId>Matrix-Math</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```

3. Refresh Maven

## Usage

Create Matrix 2x2 filled with zeros for default

```java
  Matrix A = new Matrix();
```

Create Matrix MxN filled with zeros for default

```java
  //..Matrix(M,N);
  Matrix A = new Matrix(3, 3);
```

Display Matrix

```java
  A.show();
```

Fill a Matrix with ones

```java
  A.ones();
```

Fill a Matrix with zeros

```java
  A.zeros();
```

Fill a Matrix with n value

```java
  //fill(n)
  A.fill(10);
```

Fill a Matrix with random numbers between 0 and 1

```java
  A.random();
```

Fill a Matrix with random numbers between 0 and n

```java
  //random(n)
  A.random(10);
```

Fill a Matrix with random numbers in a range

```java
  //random(min, max)
  A.random(5, 10);
```
## Basic Operations with Matrices

Add n to Matrix

```java
  //Create Matrix
  Matrix A = new Matrix();
  
  //Initializing matrix with ones
  A.ones();
  
  //Add n to each element of Matrix
  A.add(10);
```


Add Matrix B to Matrix A

```java
  //Create Matrices
  Matrix A = new Matrix();
  Matrix B = new Matrix();
  
  //Initializing matrices with ones
  A.ones();
  B.ones();
  
  //Add B to A
  A.add(b);
```
Add Matrix B to Matrix A and return the result as a new Matrix

```java
  //Create Matrices
  Matrix A = new Matrix();
  Matrix B = new Matrix();
  
  //Initializing matrices with ones
  A.ones();
  B.ones();
  
  //The result stored in a new Matrix
  Matrix c = Matrix.add(a, b);
```
Scalar Matrix by n number

```java
  //Create Matrix
  Matrix A = new Matrix();
  
  //Initializing matrix with ones
  A.ones();
  
  //Scalar the matrix by 2
  A.mult(2);
```

Multiply Matrix A by Matrix B and return the result as a new Matrix

```java
  //Create Matrices
  Matrix A = new Matrix(3, 2);
  Matrix B = new Matrix(2, 3);
  
  //Initializing matrices with random numbers between 0 and 5
  A.random(5);
  B.random(5);
  
  //Multiply A by B, the result stored in a new Matrix 
  Matrix c = Matrix.mult(a, b);
```
