class Solution {
    public int calPoints(String[] op) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String a : op) {
            if (a.equals("+")) {
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            } else if (a.equals("D")) {
                list.add(2 * list.get(list.size() - 1));
            } else if (a.equals("C")) {
                list.remove(list.size() - 1);
            } else {
                int p = Integer.parseInt(a);
                list.add(p);
            }
        }
        int sum = 0;
        for (int j : list) {
            sum += j;
        }
        return sum;
    }
}
