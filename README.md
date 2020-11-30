Краткие резултаты:

Десериализация:
Benchmark                                       Mode  Cnt        Score         Error  Units
DeserializationJSON.deserializationThroughput  thrpt    7  7739100,547 ± 1280168,829  ops/s
DeserializationJSON.deserializationAvgTime      avgt    7       ≈ 10⁻⁶                 s/op

Benchmark                                           Mode  Cnt         Score        Error  Units
DeserializationProtobuf.deserializationThroughput  thrpt    7  30091879,604 ± 639925,280  ops/s
DeserializationProtobuf.deserializationAvgTime      avgt    7        ≈ 10⁻⁷                s/op

Сериализация:
Benchmark                                   Mode  Cnt         Score        Error  Units
SerializationJSON.serializationThroughput  thrpt    7  13322211,665 ± 302149,174  ops/s
SerializationJSON.serializationAvgTime      avgt    7        ≈ 10⁻⁷                s/op

Benchmark                                       Mode  Cnt        Score        Error  Units
SerializationProtobuf.serializationThroughput  thrpt    7  4133271,271 ± 341441,168  ops/s
SerializationProtobuf.serializationAvgTime      avgt    7       ≈ 10⁻⁶                s/op

Побробнее в папке results
Вывод: grpc быстрее , чем rest и предпочтительнее использовать его
