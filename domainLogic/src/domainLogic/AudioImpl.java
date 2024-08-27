package domainLogic;

import contract.Audio;
import contract.Tag;
import contract.Uploader;

import java.math.BigDecimal;
import java.util.Collection;

public class AudioImpl extends MediaUploadableItem implements Audio {
    private int samplingRate;

    public AudioImpl(Collection<Tag> tags, long size, Uploader uploader, BigDecimal cost, int samplingRate) {
        super(tags, size, uploader, cost);
        this.samplingRate = samplingRate;
    }

    @Override
    public int getSamplingRate() {
        return samplingRate;
    }
}