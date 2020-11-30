package protobuf;

import dto.StudentDTO;
import dto.StudentProtoDTO;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;



public class DeserializationProtobuf {
    private static StudentProtoDTO.StudentDTO.Builder userBuilder = StudentProtoDTO.StudentDTO.newBuilder()
            .setAge("24")
            .setName("Timur")
            .setSurname("Skotnikov");


    private static StudentProtoDTO.StudentDTO userDTO = userBuilder.build();
    private static byte[] dataSerialize = userDTO.toByteArray();

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void deserializationThroughput() throws IOException {
        StudentProtoDTO.StudentDTO res =StudentProtoDTO.StudentDTO.parseFrom(dataSerialize);
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void deserializationAvgTime() throws IOException {
        StudentProtoDTO.StudentDTO res = StudentProtoDTO.StudentDTO.parseFrom(dataSerialize);
    }


    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(DeserializationProtobuf.class.getSimpleName())
                .threads(4)
                .warmupIterations(5)
                .measurementIterations(7)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
