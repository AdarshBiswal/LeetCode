## `812.`  Largest Triangle Area


### Problem statement


```text
Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the area of the largest triangle that can be formed by any three different points.

Answers within 10-5 of the actual answer will be accepted.
Example 1:
    Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
    Output: 2.00000

Example 2:
    Input: points = [[1,0],[0,0],[0,1]]
    Output: 0.50000

   
```


### Approch

##### Using Bruteforce Approch

```text
1. We first take maxArea till now=0.
2. Loop i from 0 to all points
3.     assign x1=points[i][0] and y1=points[i][1]
4.     Loop j from 0 to all points
5.         assign x2 = points[j][0] and y2 = points[j][1]
6.         Loop k from 0 to all points
               assign x3 = points[k][0] and y3 = points[k][1]
7.             calculate area=0.5 * ( (x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2)) )
8.             compare if(maxArea<area) maxArea=area;
9.  return maxArea                          
```

### CODE

```java
public static double largestTriangleArea(int[][] points)
{
    double maxArea=0;
    for(int i=0;i<points.length;i++)
    {
        double x1=points[i][0];
        double y1=points[i][1];
        for(int j=0;j<points.length;j++)
        {
            double x2 = points[j][0];
            double y2 = points[j][1];
            for(int k=0;k<points.length;k++)
            {
                double x3 = points[k][0];
                double y3 = points[k][1];
                double area= 0.5 * ( (x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2)) );
                if(maxArea<area)
                    maxArea=area;
            }
        }
    }

    return maxArea;
}
```


## Link
[Largest Triangle Area](https://leetcode.com/problems/largest-triangle-area/)