package apps.xenione.com.demoloader.infrastructure.presenters;

/**
 * Created by Eugeni on 03/10/2016.
 */
public class BasePresenter<V> {

    protected V mView;

    public void attach(V view) {
        mView = view;
    }

    public void detach(V view) {
        if (view != mView) {
            return;
        }
        mView = null;
    }
}
