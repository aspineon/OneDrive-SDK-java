package org.onedrive.network.async;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import org.jetbrains.annotations.NotNull;
import org.onedrive.container.items.BaseItem;

import java.nio.file.Path;

/**
 * {@// TODO: Enhance javadoc }
 *
 * @author <a href="mailto:yoobyeonghun@gmail.com" target="_top">isac322</a>
 */
public interface UploadFuture extends Future<BaseItem> {
	@NotNull Path filePath();

	@Override UploadFuture addListener(GenericFutureListener<? extends Future<? super BaseItem>> listener);

	@Override UploadFuture addListeners(GenericFutureListener<? extends Future<? super BaseItem>>[] listeners);

	@Override UploadFuture removeListener(GenericFutureListener<? extends Future<? super BaseItem>> listener);

	@Override UploadFuture removeListeners(GenericFutureListener<? extends Future<? super BaseItem>>[] listeners);

	@Override UploadFuture sync() throws InterruptedException;

	@Override UploadFuture syncUninterruptibly();

	@Override UploadFuture await() throws InterruptedException;

	@Override UploadFuture awaitUninterruptibly();
}
