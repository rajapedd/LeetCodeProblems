package com.raja.easy;

import java.util.Arrays;


public class MergeSortedArrayL88 {
    public static void main(String[] args) {
//       int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        mergeSortedArray(nums1,m,nums2,n);
    }

    private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[index++];
        }
        System.out.println(Arrays.toString(nums1));
        int start=0, end=nums1.length-1;
        mergeSort(nums1,start,end);
        System.out.println(Arrays.toString(nums1));
    }

    private static void mergeSort(int[] nums1, int start, int end) {
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(nums1,start,mid);
            mergeSort(nums1,mid+1,end);
            mergeArray(nums1,start,mid,end);
        }

    }

    private static void mergeArray(int[] nums1, int start, int mid, int end) {
        System.out.println("START::"+Arrays.toString(nums1));
        int left=mid-start+1;
        int right=end-mid;
        System.out.println("Left length::"+left);
        System.out.println("right length::"+right);
        int[] l=new int[left];
        int[] r=new int[right];
        for(int i=0;i<left;i++){
            l[i]=nums1[start+i];
        }
        System.out.println("Left Array::"+ Arrays.toString(l));
        for(int i=0;i<right;i++){
            r[i]=nums1[mid+1+i];
        }
        System.out.println("right Array::"+ Arrays.toString(r));
        int m=0,n=0,k=start;
        while(m<l.length && n<r.length){
            if(l[m]<r[n]){
              nums1[k++]=l[m++];
            }else{
                nums1[k++]=r[n++];
            }
        }

        while(m<l.length){
            nums1[k++]=l[m++];
        }

        while(n<r.length){
            nums1[k++]=r[n++];
        }


    }
}
