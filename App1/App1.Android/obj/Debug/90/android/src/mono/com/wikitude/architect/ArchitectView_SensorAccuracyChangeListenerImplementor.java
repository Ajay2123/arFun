package mono.com.wikitude.architect;


public class ArchitectView_SensorAccuracyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.wikitude.architect.ArchitectView.SensorAccuracyChangeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCompassAccuracyChanged:(I)V:GetOnCompassAccuracyChanged_IHandler:Com.Wikitude.Architect.ArchitectView/ISensorAccuracyChangeListenerInvoker, Wikitude.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Wikitude.Architect.ArchitectView+ISensorAccuracyChangeListenerImplementor, Wikitude.Android", ArchitectView_SensorAccuracyChangeListenerImplementor.class, __md_methods);
	}


	public ArchitectView_SensorAccuracyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ArchitectView_SensorAccuracyChangeListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Wikitude.Architect.ArchitectView+ISensorAccuracyChangeListenerImplementor, Wikitude.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCompassAccuracyChanged (int p0)
	{
		n_onCompassAccuracyChanged (p0);
	}

	private native void n_onCompassAccuracyChanged (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
