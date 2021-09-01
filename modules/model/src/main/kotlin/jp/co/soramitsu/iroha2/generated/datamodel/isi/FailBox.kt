//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.isi

import io.emeraldpay.polkaj.scale.ScaleCodecReader
import io.emeraldpay.polkaj.scale.ScaleCodecWriter
import io.emeraldpay.polkaj.scale.ScaleReader
import io.emeraldpay.polkaj.scale.ScaleWriter
import kotlin.String

/**
 * FailBox
 *
 * Generated from 'iroha_data_model::isi::FailBox' regular structure
 */
public data class FailBox(
    public val message: String
) {
    public companion object : ScaleReader<FailBox>, ScaleWriter<FailBox> {
        public override fun read(reader: ScaleCodecReader): FailBox = FailBox(
            reader.readString(),
        )

        public override fun write(writer: ScaleCodecWriter, instance: FailBox) {
            writer.writeAsList(instance.message.toByteArray(Charsets.UTF_8))
        }
    }
}