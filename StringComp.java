class StringComp {

    public static void main(String[] args) {
        char[] chars = {'G','E','E','E','K','S','S'};
        int result = compress(chars);
        System.out.println(result);
    }

    public static int compress(char[] chars) {
        int left = 0;
        int right = 0;
        int k = 0;
        int n = chars.length;

        while(right < n){
            while(right < n && chars[left]==chars[right]){
                right++;
            }

            chars[k++] = chars[left];
            int num = right - left;
            if(num > 1){
                String countStr = Integer.toString(num);
                for(char c : countStr.toCharArray()){
                    chars[k++] = c;
                }
            }
            left = right;
        }
        return k;
    }
}
