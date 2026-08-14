// Last updated: 8/14/2026, 12:14:04 PM
1class Solution {
2    public boolean isValid(String code) {
3        Stack<String> tagStack =  new Stack<>();
4
5        int n = code.length();
6        int i = 0 ;
7
8        while (i < n ){
9            if ( i>0 && tagStack.isEmpty()) return false;
10          
11            if ( i+9 <= n && code.substring(i,i+9).equals("<![CDATA[")){
12                int cDataEnd = code.indexOf("]]>" , i+9);
13                if (cDataEnd == -1) return false ;
14                i = (cDataEnd + 3);
15            }else if ( i+1 < n && code.substring(i,i+2).equals("</")){
16                int tagEnd = code.indexOf('>', i+2);
17                if (tagEnd == -1) return false;
18
19                String tagName = code.substring(i+2,tagEnd);
20                if (tagStack.isEmpty() || !tagStack.pop().equals(tagName)) return false;
21                i = tagEnd + 1;
22            }else if ( code.charAt(i) == '<'){
23                int tagEnd = code.indexOf('>', i+1);
24                if (tagEnd == -1) return false;
25
26                String tagName = code.substring(i+1, tagEnd);
27                if (!isValidTag(tagName)) return false; 
28                tagStack.push(tagName);
29                i = tagEnd + 1; 
30
31            }else {
32                i++;
33            }
34        }
35        return tagStack.isEmpty();
36    }
37    public boolean isValidTag(String tagName){
38        if (tagName.length() == 0 || tagName.length() >9) return false;
39
40        for (char ch: tagName.toCharArray()){
41            if (ch < 'A' || ch > 'Z') return false;
42        }
43        return true;
44    }
45}