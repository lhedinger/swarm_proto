package net.hedinger.prototype.utility;

public class Stopwatch
{
    private static long start_ms = 0;
    private static long split_ms = 0;
    private static boolean disabled = false;

    public static void start()
    {
	if (disabled) return;

	split_ms = start_ms = System.currentTimeMillis();
	System.out.println("--------------------------");
	System.out.println("started at " + start_ms + " ms");
    }

    public static void stop()
    {
	if (disabled) return;

	long current = System.currentTimeMillis();
	long delta = current - start_ms;
	System.out.println("final= " + delta + " ms");
	System.out.println("stopped at " + current + " ms");
	System.out.println("--------------------------");
    }

    public static void split(String name)
    {
	if (disabled) return;

	long current = System.currentTimeMillis();
	long delta = current - split_ms;
	split_ms = current;
	System.out.println(name + "= " + delta + " ms   ");
    }

}
