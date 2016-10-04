package org.onedrive.container.items;

import lombok.Getter;
import org.json.simple.JSONObject;

/**
 * https://dev.onedrive.com/resources/itemReference.htm
 * {@// TODO: Enhance javadoc}
 *
 * @author <a href="mailto:yoobyeonghun@gmail.com" target="_top">isac322</a>
 */
public class ItemReference {
	@Getter protected final String driveId;
	@Getter protected final String id;
	@Getter protected final String path;

	protected ItemReference(String driveId, String id, String path) {
		this.driveId = driveId;
		this.id = id;
		this.path = path;
	}

	public static ItemReference parse(JSONObject json) {
		if (json == null) return null;

		return new ItemReference(
				json.getString("driveId"),
				json.getString("id"),
				json.getString("path")
		);
	}
}
