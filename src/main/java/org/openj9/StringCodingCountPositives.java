package org.openj9;

import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@Fork(value = 3)
@Warmup(iterations = 3, time = 2000, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 3, time = 1000, timeUnit = TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
public class StringCodingCountPositives {
    public static byte[] src;

    @Param({ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "16", "17", "18", "32", "33", "34", "64", "65", "66", "127", "128", "129", "255", "256", "257" })
    public int len;

    @Setup
    public void setup() {
        src = new byte[300];

        for (int i = 0; i < src.length; ++i) {
            src[i] = (byte)i;
        }
    }

    @Benchmark
    public void testCountPositives() {
	// TODO: publicly expose the StringCoding class to succesfully compile and run this benchmark
        StringCoding.countPositives(src, 0, len);
    }
}


