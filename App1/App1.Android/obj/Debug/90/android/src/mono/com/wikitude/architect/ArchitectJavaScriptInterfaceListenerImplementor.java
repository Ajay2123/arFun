package mono.com.wikitude.architect;


public class ArchitectJavaScriptInterfaceListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.wikitude.architect.ArchitectJavaScriptInterfaceListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onJSONObjectReceived:(Lorg/json/JSONObject;)V:GetOnJSONObjectReceived_Lorg_json_JSONObject_Handler:Com.Wikitude.Architect.IArchitectJavaScriptInterfaceListenerInvoker, Wikitude.Android\n" +
			"";
		mono.android.Runtime.register ("Com.Wikitude.Architect.IArchitectJavaScriptInterfaceListenerImplementor, Wikitude.Android", ArchitectJavaScriptInterfaceListenerImplementor.class, __md_methods);
	}


	public ArchitectJavaScriptInterfaceListenerImplementor ()
	{
		super ();
		if (getClass () == ArchitectJavaScriptInterfaceListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Wikitude.Architect.IArchitectJavaScriptInterfaceListenerImplementor, Wikitude.Android", "", this, new java.lang.Object[] {  });
	}


	public void onJSONObjectReceived (org.json.JSONObject p0)
	{
		n_onJSONObjectReceived (p0);
	}

	private native void n_onJSONObjectReceived (org.json.JSONObject p0);

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
