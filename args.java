class args {
    public static void main(String[] args) {  // renamed args to data
        System.out.println("Total inputs: " + args.length);

        for (int i = 0; i < data.length; i++) {
            System.out.println("Input " + i + ": " + data[i]);
        }
    }
}
