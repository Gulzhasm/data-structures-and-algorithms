package leetcode.topicWise.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Array {

    public int lengthOfLastWord(String s) {
        int ans = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            ans++;
        }
        return ans;
    }

    public static int numberOfSubarrays(int[] A, int k) {
        int res = 0, i = 0, j = 0, count = 0;
        while (j < A.length) {
            if (A[j] % 2 == 1) {
                k--;
                count = 0;
            }
            while (k == 0) {
                if (A[i] % 2 == 1) {
                    k++;
                }
                count++;
                i++;
            }
            j++;
            res += count;
        }
        return res;
    }

    public static long countSubarrays1(int[] A, int k) {
        long cnt = 0;
        int r = 0, max = 0, curr = 0;
        for (int n : A) {
            max = Math.max(max, n);
        }

        for (int l = 0; l < A.length; l++) {
            curr += A[l] == max ? 1 : 0;
            while (curr >= k)
                curr -= A[r++] == max ? 1 : 0;

            cnt += r;
        }
        return cnt;

    }


    public static boolean containsDuplicateSort(int[] nums) {
        Arrays.sort(nums);
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            j = i + 1;
            if (nums[i] == nums[j]) return true;
        }
        return false;
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int potentialSum = target - nums[i];
            if (map.containsKey(potentialSum)) return new int[]{map.get(potentialSum), i};
            else map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3}, 2);
    }

    //Input: nums = [1,1,1,2,2,3], k = 2 => 1=3, 2 =2,
    //Output: [1,2]
    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> sorted = new ArrayList<>(map.keySet());
        sorted.sort((a, b) -> map.get(b) - map.get(a));
        System.out.println(sorted);

        for(int i = 0; i < k; i++){
            ans[i] = sorted.get(i);
        }
        return ans;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) map.put(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String[] helper(String[] arr) {
        String[] ans = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            ans[i] = sorted;
        }
        return ans;
    }

    public static int[] searchRange(int[] A, int target) {
        int idx = bs(A, target);
        if (idx == -1) return new int[]{-1, -1};
        else if (A[idx] == A[idx + 1]) return new int[]{idx, idx + 1};
        else return new int[]{idx - 1, idx};
    }

    private static int bs(int[] A, int target) {
        int lo = 0, hi = A.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;
            if (A[mid] > target) {
                hi = mid - 1;
            } else if (A[mid] < target) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int s = 0, e = n - 1, init = 1;
        while (s < e) {
            ans[s++] = init;
            ans[e--] = -init;
            init++;
        }
        return ans;
    }


    public static long countSubarrays(int[] A, int k) {

        long cnt = 0;
        int r = 0, max = 0;
        for (int n : A) {
            max = Math.max(max, n);
        }

        for (int l = 0; l < A.length; l++) {
            r = l + 1;
            int lm = 0;
            while (r < A.length) {
                if (A[r] == max) lm++;
                if (A[l] == max) lm++;

                if (lm >= k) {
                    cnt++;
                }

                r++;
            }
        }
        return cnt;
    }

    //  [3,4,-1,1] 3 4 1
    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == i + 1 || A[i] <= 0 || A[i] > A.length) i++;
            else if (A[A[i] - 1] != A[i]) swap(A, i, A[i] - 1);
            else i++;
        }
        i = 0;
        while (i < A.length && A[i] == i + 1) i++;
        return i + 1;
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public List<Integer> findDuplicates(int[] nums) { // Time complexity - O(N), Space Complexity O(N)
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                ans.add(num);
            }
            set.add(num);
        }
        return ans;
    }


    public static int findDuplicate(int[] A) {
        int dupe = 0, s = 0, n = 1;
        Arrays.sort(A);
        while (n < A.length) {
            if (A[s] == A[n]) {
                dupe = A[s];
            }
            s++;
            n++;
        }
        return dupe;
    }


    public static int findMaxLength(int[] n) {
        int ans = 0, N = n.length;

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);

        for (int i = 0; i < N; i++) {
            sum += n[i] == 0 ? -1 : n[i];

            if (map.containsKey(sum)) {
                ans = Math.max(ans, i - map.get(sum));
            } else map.put(sum, i);
        }
        return ans;

    }

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> l : paths) set.add(l.get(1));
        for (List<String> l : paths) set.remove(l.get(0));
        return set.iterator().next();
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int lp = 1, rp = 1;
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = lp;
            lp *= nums[i];
        }
        for (int i = N - 1; i >= 0; i--) {
            res[i] = res[i] * rp;
            rp *= nums[i];
        }
        return res;
    }

    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int n : n1) {
            s1.add(n);
        }

        for (int n : n2) {
            if (s1.contains(n)) s2.add(n);
        }

        int[] ans = new int[s2.size()];
        int i = 0;

        for (int n : s2) {
            ans[i++] = n;
        }
        return ans;
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int freq = 0, max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) freq = max = entry.getValue();
            else if (max == entry.getValue()) freq += max;
        }
        return freq == 0 ? map.size() : freq;
    }

    public int getCommon(int[] n1, int[] n2) {
        int i = 0, j = 0;

        while (i < n1.length && j < n2.length) {
            if (n1[i] < n2[j]) i++;
            else if (n1[i] > n2[j]) j++;
            else if (n1[i] == n2[j]) return n1[i];
        }
        return -1;
    }


    public static int[] sumOddLengthSubarrays(int[] arr) {
        int N = arr.length;
        int[] pSum = new int[N];
        pSum[0] = arr[0];

        for (int i = 1; i < N; i++) {
            int prev = pSum[i - 1];
            pSum[i] = prev + arr[i];
        }
        return pSum;
    }
}
