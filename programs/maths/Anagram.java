class Anagram{
    public static void main(String[] args){
        int counts[]=new int[26];
        String s1="vamsi";
        String s2="Ismava";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        s1=s1.replaceAll(" ","");
        s2=s2.replaceAll(" ","");
        for(int i=0;i<s1.length();i++){
            counts[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            counts[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0){
                System.out.println("Not an Anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
}