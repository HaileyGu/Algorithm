// quick select
// This is known as "quickselecting by a pivot x"
class Solution {
private:
    vector<vector<int>> mypoints;

    int dist(int i) {
        return mypoints[i][0]*mypoints[i][0]+mypoints[i][1]*mypoints[i][1];
    }

    void swap(int i, int j) {
        int temp0 = mypoints[i][0];
        int temp1 = mypoints[i][1];
        mypoints[i][0] = mypoints[j][0];
        mypoints[i][1] = mypoints[j][1];
        mypoints[j][0] = temp0;
        mypoints[j][1] = temp1;
    }

    int partition(int i, int j) {
        int oi=i;
        int pivot=dist(i);
        i++;

        while(true) {
            while(i<j && dist(i) < pivot) i++;
            while(i<=j && dist(j) > pivot) j--;
            if(i>=j) break;
            swap(i,j);
        }
        swap(oi,j);
        return j;
    }

    void sort(int i, int j, int K) {
        if(i>=j) return;
        int oi=i, oj=j;
        int k = i+rand()%(j-i);
        swap(i,k);

        int mid = partition(i,j);
        int leftLength = mid - i + 1;
        if(K < leftLength)
            sort(i, mid-1, K);
        else if(K > leftLength)
            sort(mid+1, j, K-leftLength);
    }



public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int K) {
        mypoints = points;
        sort(0, points.size()-1, K);
        return vector<vector<int>>(mypoints.begin(), mypoints.begin()+K);
    }

};



// class Solution {
// public:
//     static bool cmp(vector <int> &x, vector <int> &y) {
//         return (x[0] * x[0] + x[1] * x[1]) <= (y[0] * y[0] + y[1] * y[1]);
//     }
//
//     vector<vector<int>> kClosest(vector<vector<int>>& p, int K) {
//         nth_element(p.begin(), p.begin() + K, p.end(), cmp);
//         p.resize(K);
//         return p;
//     }
// };
//
// static int fastio = []() {
//     #define endl '\n'
//     std::ios::sync_with_stdio(false);
//     std::cin.tie(NULL);
//     std::cout.tie(0);
//     return 0;
// }();
