package domainLogic;

import contract.AudioVideo;
import contract.Tag;
import contract.Uploader;

import java.math.BigDecimal;
import java.util.Collection;

public class AudioVideoImpl extends MediaUploadableItem implements AudioVideo {
    private int sampleRate;
    private int resolution;


    public AudioVideoImpl(Collection<Tag> tags, long size, Uploader uploader, BigDecimal cost, int sampleRate, int resolution) {
        super(tags, size, uploader, cost);
        this.sampleRate = sampleRate;
        this.resolution = resolution;
    }

    @Override
    public int getSamplingRate() {
        return sampleRate;
    }

    @Override
    public int getResolution() {
        return resolution;
    }
}