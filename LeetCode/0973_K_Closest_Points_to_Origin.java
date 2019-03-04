// quick select
// This is known as "quickselecting by a pivot x"
class Solution {

  private int getDist(int[] point) {
      return point[0] * point[0] + point[1] * point[1];
  }

  private void swap(int[][] points, int i, int j) {
      int t0 = points[i][0];
      int t1 = points[i][1];
      points[i][0] = points[j][0];
      points[i][1] = points[j][1];
      points[j][0] = t0;
      points[j][1] = t1;
  }

  private int partition(int[][] points, int l, int r) {
      int tmp = r;
      int pivotDist = getDist(points[r]);
      r -= 1;

      while(l <= r) {
          while (l <= r && getDist(points[l]) < pivotDist)
              l++;
          while (l <= r && getDist(points[r]) >= pivotDist)
              r--;

          if (l <= r) {
              swap(points, l, r);
              l++;
              r--;
          }
      }
      swap(points, tmp, l);
      return l;
  }

  public void sort(int[][] points, int K, int start, int end) {
      if (start >= end) return;

      /* Fancy way to pick pivot
      int k = ThreadLocalRandom.current().nextInt(start, end);
      // swap with the end
      swap(points, k, end);
      */

      // here, we just pick the last as pivot

      int mid = partition(points, start, end);
      int leftLength = mid - start + 1;

      /* Method 1 to switch*/
      if (K < mid) {
          sort(points, K, start, mid - 1);
      }else if (K > mid) {
          sort(points, K, mid + 1, end);
      }


      /* Method 2: Divide and Conquer (Quick Partition)*/
      public int[][] kClosest(int[][] points, int K) {
          int[][] res = new int[K][];
          if (points == null || points.length == 0 || K >= points.length) return res;

          sort(points, K, 0, points.length - 1);

          return Arrays.copyOfRange(points, 0, K);

      }

      /* Method 2 to switch*/
      // if (K < leftLength)
      //     sort(points, K, start, mid - 1);
      // else if (K > leftLength)
      //     sort(points, K, mid + 1, end);

      // else we find right position K == mid

  }
    /* Method 1 : Heap*/
//     public int[][] kClosest(int[][] points, int K) {
//         int[][] res = new int[K][];

//         if (points == null || points.length == 0 || K >= points.length) return res;

//         // max heap
//         PriorityQueue<int[]> pq = new PriorityQueue<int[]>(K + 1, (o1, o2) -> getDist(o2) - getDist(o1));

//         for (int[] point : points) {
//             pq.add(point);
//             if (pq.size() > K) {
//                 pq.poll();
//             }
//         }

//         for (int i = 0; i < K; i++) {
//             res[i] = pq.poll();
//         }

//         return res;

//     }


}
