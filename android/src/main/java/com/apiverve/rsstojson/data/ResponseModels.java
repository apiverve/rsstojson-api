// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     RSStoJSONData data = Converter.fromJsonString(jsonString);

package com.apiverve.rsstojson.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static RSStoJSONData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(RSStoJSONData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(RSStoJSONData.class);
        writer = mapper.writerFor(RSStoJSONData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// RSStoJSONData.java

package com.apiverve.rsstojson.data;

import com.fasterxml.jackson.annotation.*;

public class RSStoJSONData {
    private String source;
    private long articles;
    private boolean maxReached;
    private Feed[] feed;

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("articles")
    public long getArticles() { return articles; }
    @JsonProperty("articles")
    public void setArticles(long value) { this.articles = value; }

    @JsonProperty("maxReached")
    public boolean getMaxReached() { return maxReached; }
    @JsonProperty("maxReached")
    public void setMaxReached(boolean value) { this.maxReached = value; }

    @JsonProperty("feed")
    public Feed[] getFeed() { return feed; }
    @JsonProperty("feed")
    public void setFeed(Feed[] value) { this.feed = value; }
}

// Feed.java

package com.apiverve.rsstojson.data;

import com.fasterxml.jackson.annotation.*;

public class Feed {
    private Website website;
    private String title;
    private String pubDate;
    private String description;
    private String link;

    @JsonProperty("website")
    public Website getWebsite() { return website; }
    @JsonProperty("website")
    public void setWebsite(Website value) { this.website = value; }

    @JsonProperty("title")
    public String getTitle() { return title; }
    @JsonProperty("title")
    public void setTitle(String value) { this.title = value; }

    @JsonProperty("pubDate")
    public String getPubDate() { return pubDate; }
    @JsonProperty("pubDate")
    public void setPubDate(String value) { this.pubDate = value; }

    @JsonProperty("description")
    public String getDescription() { return description; }
    @JsonProperty("description")
    public void setDescription(String value) { this.description = value; }

    @JsonProperty("link")
    public String getLink() { return link; }
    @JsonProperty("link")
    public void setLink(String value) { this.link = value; }
}

// Website.java

package com.apiverve.rsstojson.data;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Website {
    NASA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case NASA: return "NASA";
        }
        return null;
    }

    @JsonCreator
    public static Website forValue(String value) throws IOException {
        if (value.equals("NASA")) return NASA;
        throw new IOException("Cannot deserialize Website");
    }
}