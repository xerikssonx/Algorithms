package binary_search;

/**
 * The {@code BinarySearch} class provides a static method for binary searching
 * for an integer in a sorted array of integers.
 * <p>
 * The <em>indexOf</em> operations takes logarithmic time in the worst case.
 * <p>
 * For additional documentation, see
 * <a href="http://algs4.cs.princeton.edu/11model">Section 1.1</a> of
 * <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 *
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class BinarySearch {

	/**
	 * This class should not be instantiated.
	 */
	private BinarySearch() {
	}

	/**
	 * Returns the index of the specified key in the specified array.
	 *
	 * @param a
	 *            the array of integers, must be sorted in ascending order
	 * @param key
	 *            the search key
	 * @return index of key in array {@code a} if present; {@code -1} otherwise
	 */
	public static int indexOf(int[] a, int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * Reads in a sequence of integers from the whitelist file, specified as a
	 * command-line argument; reads in integers from standard input; prints to
	 * standard output those integers that do <em>not</em> appear in the file.
	 *
	 * @param args
	 *            the command-line arguments
	 */
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println(indexOf(a, 7));
	}
}