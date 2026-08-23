class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> hs;
        int l = 0;
        int maxLength = 0;

        for(int r = 0; r < s.size();r++){
            while(hs.count(s[r])){
                hs.erase(s[l]);
                l++;
            }

            hs.insert(s[r]);
            maxLength = max(maxLength, r-l+1);
        }

        return maxLength;
    }
};