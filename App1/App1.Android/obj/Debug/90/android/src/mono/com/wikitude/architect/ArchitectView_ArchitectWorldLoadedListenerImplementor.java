package mono.com.wikitude.architect;


public class ArchitectView_ArchitectWorldLoadedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.wikitude.architect.ArchitectView.ArchitectWorldLoadedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_worldLoadFailed:(ILjava/lang/String;Ljava/lang/String;)V:GetWorldLoadFailed_ILjava_lang_String_Ljava_lang_String_Handler:Com.Wikitude.Architect.ArchitectView/IArchitectWorldLoadedListenerInvoker, Wikitude.Android\n" +
			"n_worldWasLoaded:(Ljava/lang/String;)V:GetWorldWasLoaded_Ljava_lang_String_Handler:Com.Wikitude.Architect.ArchitectView/IArchitectWorldLoadedListenerInvoker, Wikitude.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Wikitude.Architect.ArchitectView+IArchitectWorldLoadedListenerImplementor, Wikitude.Android", ArchitectView_ArchitectWorldLoadedListenerImplementor.class, __md_methods);
	}


	public ArchitectView_ArchitectWorldLoadedListenerImplementor ()
	{
		super ();
		if (getClass () == ArchitectView_ArchitectWorldLoadedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Wikitude.Architect.ArchitectView+IArchitectWorldLoadedListenerImplementor, Wikitude.Android", "", this, new java.lang.Object[] {  });
	}


	public void worldLoadFailed (int p0, java.lang.String p1, java.lang.String p2)
	{
		n_worldLoadFailed (p0, p1, p2);
	}

	private native void n_worldLoadFailed (int p0, java.lang.String p1, java.lang.String p2);


	public void worldWasLoaded (java.lang.String p0)
	{
		n_worldWasLoaded (p0);
	}

	private native void n_worldWasLoaded (java.lang.String p0);

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
