package cgeo.geocaching.connector.trackable;

import cgeo.geocaching.Trackable;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Methods to be implemented by any connector for handling trackables
 *
 */
public interface TrackableConnector {

    public boolean canHandleTrackable(final String geocode);

    public String getUrl(final Trackable trackable);

    public boolean isLoggable();

    public Trackable searchTrackable(String geocode, String guid, String id);

    public String getTrackableCodeFromUrl(final @NonNull String url);

}
