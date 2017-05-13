package jz;

import java.util.Arrays;

import jz.DoubleLinkedList.ListNode;

public class HelloWorld {

	public static void main(String[] args) {
	    
	    int[] nums1 = {1,2,2,3,4,5};
	    int[] nums2 = {0,8,8,8,9};
	    Util.printArray(nums1);
	    Util.printArray(nums2);
		Util.printArray(intersect(nums1, nums2));

	}
	
	public  static int[] intersect(int[] nums1, int[] nums2) {
        // Write your code here
        int[] res = nums1.length < nums2.length ? new int[nums1.length] : new int[nums2.length];
        if (res.length == 0) {
            return res;
        }
        
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
        
        int pt1 = 0;
        int pt2 = 0;
        int pt = 0;
        while(pt1 < nums1.length && pt2 < nums2.length) {
            int n1 = nums1[pt1];
            int n2 = nums2[pt2];
            if (n1 == n2) {
                res[pt++] = n1;
                pt1++;
                pt2++;
            } else if (n1 > n2) {
                pt2++;
            } else {
                pt1++;
            }
        }
        return Arrays.copyOfRange(res, 0, pt);
    }

}
