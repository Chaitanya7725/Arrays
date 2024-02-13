package medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int []{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int []{1,1}));
    }

    public static int maxArea(int[] height) {
        int first =0;
        int last =height.length-1;
        int area = 0;
        while(first<=last){
            if((last - first) * Math.min(height[first],height[last]) > area)
                area = (last - first) * Math.min(height[first],height[last]);
            if(height[first] > height[last])
                last --;
            else
                first++;
        }
        return area;
    }

}
