class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int n : arr) {
            occurrences.put(n, occurrences.getOrDefault(n, 0) + 1);
        }

        Set<Integer> distinctOcc = new HashSet<>();

        for (int n : occurrences.values()) {
            if (distinctOcc.contains(n)) {
                return false;
            }
            distinctOcc.add(n);
        }

        return true;

    }
}