public class Main {
    private static int maximum69Number;


	public static int maximum69Number(int num) {

        List<Integer> list = new ArrayList<>();

        while (num != 0) {
            list.add(num % 10);
            num = num / 10;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 6) {
                list.set(i, 9);
                break;
            }
        }

        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a = a + list.get(i) * 10;
        }

        return a;
    }

    public static void main(String[] args) {
        int maximum69Number = maximum69Number(9969);
        System.out.println(maximum69Number);
    }


    
}