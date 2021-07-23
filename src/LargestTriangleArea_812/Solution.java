package LargestTriangleArea_812;

public class Solution {

    public static void main(String[] args) {
        int points[][]={{0,0},{0,1},{1,0},{0,2},{2,0}};
        System.out.println(largestTriangleArea(points));
    }

    public static double largestTriangleArea(int[][] points) {

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
}
