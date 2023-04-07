package recording;

import java.util.*;
import style.TrackStyles;

import recording.*;


public class Disc {
	private List<Track> tracklist = new ArrayList<>();
	private TrackService service = new TrackService();

	public Disc() {
//		Track track = new Track("Queen - we will rock you ", 2.49, TrackStyles.ROCK);
//		System.out.println(track.toString());
	        tracklist.add(new Track("Queen - we will rock you ", 2.49, TrackStyles.ROCK));
	        tracklist.add(new Track("Twenty One Pilots – Stressed out ", 3.22, TrackStyles.RAP));
	        tracklist.add(new Track("Nickback - SEX ", 3.55, TrackStyles.ROCK));
	        tracklist.add(new Track("Twenty One Pilots – Heavydirtysoul ", 3.03, TrackStyles.HIPHOP));
	        tracklist.add(new Track("Kygo - Fragile", 3.51, TrackStyles.POP));
	        tracklist.add(new Track("Nickback - Hero ", 3.21, TrackStyles.ROCK));
	        tracklist.add(new Track("Shakira - Waka waka ", 3.22, TrackStyles.POP));
	        tracklist.add(new Track("Mozart - Requiem", 4.35, TrackStyles.CLASSIC));

	        
	        service.getTracklist(tracklist);
	        service.getTotalDuration(tracklist);
	        service.sortingByStyle(tracklist, TrackStyles.ROCK);
	        service.findByRange(2.49, 3.03, tracklist);

	    }
}