public class smallestchargreaterthantarget {
    public static void main(String[] args) {
        char[] letters={'c','f','j','m','w','z'};
        System.out.println(nextGreatestLetter(letters,'j'));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        //while loop condition
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        //this return condition for returning the first character if the greter element than target is not present in the array
        return letters[start % letters.length];
    }
}
