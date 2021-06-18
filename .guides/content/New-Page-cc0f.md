# Sample content New Page

ArrayList<Character> charAL = new ArrayList<>();
for (char c : "HAPPY BIRTHDAY".toCharArray()) { 
charAL.add(c);
}
int i = charAL.indexOf('D');
System.out.println(charAL.get(i));