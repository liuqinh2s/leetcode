# 第一遍，按AC率刷题

## 测试一下

```
class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i=0,j=0;
        while(i<s.size() && j<t.size()){
            if(s[i]==t[j]){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i!=s.size())
            return false;
        return true;
    }
};
```
