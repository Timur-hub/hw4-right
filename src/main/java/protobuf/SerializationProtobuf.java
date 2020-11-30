package protobuf;

import com.googlecode.protobuf.format.XmlFormat;
import dto.StudentProtoDTO;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;




public class SerializationProtobuf {

    private static StudentProtoDTO.StudentDTO.Builder userBuilder = StudentProtoDTO.StudentDTO.newBuilder()
            .setAge("24")
            .setName("Timur")
            .setSurname("Skotnikov");



    private static StudentProtoDTO.StudentDTO userDTO = userBuilder.build();




    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void serializationThroughput() {
        String res = XmlFormat.printToString(userDTO);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void serializationAvgTime() {
        String res = XmlFormat.printToString(userDTO);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(SerializationProtobuf.class.getSimpleName())
                .threads(4)
                .warmupIterations(5)
                .measurementIterations(7)
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
