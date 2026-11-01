class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1+n2;
        int mid = len/2;
        double ans = 0;
        if(n1==0 && n2==0){
            return 0;
        }
        if(n1==0 && n2>0){
            if(len%2 == 0){
                return (double)(nums2[mid-1] + nums2[mid])/2;
            }else{
                return nums2[mid];
            }
        }
        if(n2==0 && n1>0){
            if(len%2 == 0){
                return (double)(nums1[mid-1] + nums1[mid])/2;
            }else{
                return nums1[mid];
            }
        }
        int i = 0, j=0, k=0;
        int[] arr = new int[len];
        while(k <= mid){
            if(i != n1 && j != n2){
                if(nums1[i]<nums2[j]){
                    arr[k] = nums1[i];
                    i++;
                }else{
                    arr[k] = nums2[j];
                    j++;
                }
            }else if(i == n1){
                arr[k] = nums2[j];
                j++;
            }else if(j == n2){
                arr[k] = nums1[i];
                i++;
            }
            if(k == mid){
                if(len%2 != 0){
                    ans =  arr[k];
                }else{
                    ans =(double) (arr[k-1] + arr[k])/2;
                }
            }
            k++;
        }
        return ans;
    }
}