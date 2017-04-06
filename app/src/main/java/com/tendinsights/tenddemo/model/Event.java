package com.tendinsights.tenddemo.model;

/**
 * Created by Rob on 4/6/17.
 */


public class Event {
    private String id;
    private String dttm;
    private String type;
    private String srcType;
    private String srcId;
    private String deviceAlias;
    private double duration;
    private Boolean viewed;
    private Boolean favorite;
    //private EventValues values;
    //private EventMedia media;
    // private transient DateTime date;
    private Integer eventLife;
    private String status;
    private Boolean encrypted;

    public Event() {
        this.setViewed(false);
        this.setFavorite(false);
        this.setStatus("FINALIZED");
        this.setEventLife(14);
        this.setEncrypted(false);
    }

//    public void ensureValues() {
//        if (this.values == null) {
//            this.values = new EventValues();
//        }
//    }

//    public void setDefaultsForVideo() {
//        EventMedia media = this.getMedia();
//        media.setThumbnail(new EventMediaObjectImage());
//        media.setVideo(new EventMediaObject());
//        media.setVideoCdn(new EventMediaObject());
//        media.setVideoCdnInfo(new EventMediaObject());
//        media.setDownload(new EventMediaObject());
//        this.setType("MOTION_MP4");
//        this.setSrcType("cam");
//
//        // do not support this yet
//        //media.setObjectTrack(new EventMediaObject());
//    }

//    public void setDefaultsForSnapshots(int num) {
//        EventMedia media = this.getMedia();
//        media.setThumbnail(new EventMediaObjectImage());
//        media.setImageFrames(new EventMediaImageFrames(num));
//        media.setFrameTimes(new EventMediaObject());
//        media.setDownload(new EventMediaObject());
//        this.setType("MOTION_MJPEG");
//        this.setSrcType("cam");
//    }

//    public void setDefaultsForAudioAlert() {
//        this.setType("AUDIO_DATAONLY");
//        this.setSrcType("cam");
//    }
//
//    public void setDefaultsForLogEntry() {
//        this.setType("LOG_ENTRY");
//        this.setSrcType("user");
//    }
//
//    public void setDefaultsForHighlight() {
//        this.setType("HIGHLIGHT_VIDEO");
//        this.setSrcType("cam");
//        this.setEventLife(365);
//        EventMedia media = this.getMedia();
//        media.setThumbnail(new EventMediaObjectImage());
//        media.setVideo(new EventMediaObject());
//        media.setVideoCdn(new EventMediaObject());
//        media.setVideoCdnInfo(new EventMediaObject());
//        media.setDownload(new EventMediaObject());
//        media.setHighlightClips(new EventMediaObject());
//        media.setHighlightParams(new EventMediaObject());
//    }

//    public static Comparator<Event> newestFirstComparator = new Comparator<Event>() {
//        public int compare(Event e1, Event e2) {
//            return e2.getDate().compareTo(e1.getDate());
//        }
//    };
//
//    public static Comparator<Event> oldestFirstComparator = new Comparator<Event>() {
//        public int compare(Event e1, Event e2) {
//            return e1.getDate().compareTo(e2.getDate());
//        }
//    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDttm() {
        return dttm;
    }

    // use setDate
    //public void setDttm(String dttm) {
    //    this.dttm = dttm;
    //}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSrcType() {
        return srcType;
    }

    public void setSrcType(String srcType) {
        this.srcType = srcType;
    }

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getDeviceAlias() {
        return deviceAlias;
    }

    public void setDeviceAlias(String deviceAlias) {
        this.deviceAlias = deviceAlias;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

//    public EventValues getValues() {
//        if (values == null) {
//            values = new EventValues();
//        }
//        return values;
//    }
//
//    public void setValues(EventValues values) {
//        this.values = values;
//    }
//
//    public EventMedia getMedia() {
//        if (this.media == null) {
//            this.media = new EventMedia();
//        }
//        return this.media;
//    }
//
//    public void setMedia(EventMedia media) {
//        this.media = media;
//    }
//
//    public DateTime getDate() {
//        return date;
//    }
//
//    public void setDate(DateTime date) throws Exception {
//        if (this.type == null) {
//            throw new Exception("can't set date on event unless type is set first");
//        }
//
//        this.date = date;
//
//        // LOG_ENTRY dates are handled differently!
//        if (this.type.equals("LOG_ENTRY")) {
//            this.dttm = this.date.withZone(DateTimeZone.forID("UTC")).toString(ISODateTimeFormat.dateTimeNoMillis());
//        } else {
//            this.dttm = this.date.toString(ISODateTimeFormat.dateTimeNoMillis());
//        }
//
//        this.dttm.replace("Z", "+00:00");
//    }

    public int getEventLife() {
        return eventLife;
    }

    public void setEventLife(int eventLife) {
        this.eventLife = eventLife;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }
}

