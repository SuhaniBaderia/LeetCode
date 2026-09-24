class Solution {
public:
    bool rotateString(string s, string goal) {
        bool same = false;

        if(s.size() != goal.size()){
            return same;
        }
        string ss = s+s;
        if(ss.contains(goal)){
            same = true;
        }
        return same;
    }
};