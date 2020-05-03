package channels;

import channelspojo.ChannelListResponse;
import channelspojo.CreateChannelResponse;
import channelspojo.JoinChannelResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.ApiConstants;
import utils.PropertyFileUtils;
import utils.RestManager;
import utils.RestRequest;

import java.util.HashMap;
public class ChannelsActions {

	private String baseURI;
	private String token;
	PropertyFileUtils propertyFileUtils=new PropertyFileUtils();
	/**
	 * Constructor to intialize the value of BaseUri
	 */
	public ChannelsActions()
	{
		this.baseURI=propertyFileUtils.getPropertyValue("config", "baseURI");
		this.token=propertyFileUtils.getPropertyValue("config", "token");
	}


	/**
	 * 	
	 * @param channelName-name of the channel that needs to be created.
	 * @param token
	 * @return
	 */
	public RestRequest buildcreateChannelRequest(String channelName)
	{
		HashMap<String,String> headers=new HashMap();
		headers.put("Authorization", "Bearer " + token);
		String payload="{\"name\":" + "\"" + channelName + "\""+"}";
		return RestRequest.builder().method(RestRequest.METHOD.POST).url(baseURI+ApiConstants.CHANNEL_CREATE)
				.headers(headers).contentType(ContentType.JSON).payload(payload).build();

	}
	/**
	 * 
	 * @param name
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public CreateChannelResponse postCreateChannelRequest(String channelName) 
	{
		return RestManager.getInstance().execute(buildcreateChannelRequest(channelName)).as(CreateChannelResponse.class);
	}

	public RestRequest buildRenameChannelRequest(String existingChannelId,String channelName)
	{
		HashMap<String,String> headers=new HashMap();
		headers.put("Authorization", "Bearer " + token);
		String payload="{\"name\":" + "\"" + channelName + "\"" + ",\"channel\":" + "\"" + existingChannelId + "\"" + "}";
		return RestRequest.builder().method(RestRequest.METHOD.POST).url(baseURI+ApiConstants.CHANNEL_RENAME)
				.headers(headers).contentType(ContentType.JSON).payload(payload).build();
	}


	/**
	 * 
	 * @param name
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public CreateChannelResponse postReanameChannelRequest(String existingChannelId,String channelName) 
	{
		return RestManager.getInstance().execute(buildRenameChannelRequest(existingChannelId,channelName)).as(CreateChannelResponse.class);
	}
	/**
	 * 
	 * @param token
	 * @return
	 */
	public RestRequest buildGetChannelsListRequest()
	{
		HashMap<String,String> headers=new HashMap();
		headers.put("Authorization", "Bearer " + token);
		return RestRequest.builder().method(RestRequest.METHOD.GET).url(baseURI+ApiConstants.CHANNEL_LIST)
				.headers(headers).contentType(ContentType.JSON).build();
	}
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */

	/**
	 * 
	 * @param token
	 * @return
	 * @throws Exception 
	 */
	public ChannelListResponse getChannelsListRequest() 
	{
		return RestManager.getInstance().execute(buildGetChannelsListRequest()).as(ChannelListResponse.class);
	}



	/**
	 * 
	 * @param token
	 * @return
	 */
	public RestRequest buildArchiveChannelsListRequest(String name)
	{
		HashMap<String,String> headers=new HashMap();
		headers.put("Authorization", "Bearer " + token);
		String payload="{\"channel\":" + "\"" + name + "\""+"}";
		return RestRequest.builder().method(RestRequest.METHOD.POST).url(baseURI+ApiConstants.CHANNEL_ARCHIVE)
				.headers(headers).contentType(ContentType.JSON).payload(payload).build();
	}
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */

	/**
	 * 
	 * @param token
	 * @return
	 * @throws Exception 
	 */
	public Response postArchiveChannelsRequest(String channelName) 
	{
		return RestManager.getInstance().execute(buildArchiveChannelsListRequest(channelName));
	}
	/**
	 * 
	 * @param token
	 * @return
	 */
	public RestRequest buildJoinChannelsRequest(String name)
	{
		HashMap<String,String> headers=new HashMap();
		headers.put("Authorization", "Bearer " + token);
		String payload="{\"name\":" + "\"" + name + "\""+"}";
		return RestRequest.builder().method(RestRequest.METHOD.POST).url(baseURI+ApiConstants.CHANNEL_JOIN)
				.headers(headers).contentType(ContentType.JSON).payload(payload).build();
	}
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */

	/**
	 * 
	 * @param token
	 * @return
	 * @throws Exception 
	 */
	public JoinChannelResponse postJoinChannelsRequest(String channelName) 
	{
		return RestManager.getInstance().execute(buildJoinChannelsRequest(channelName)).as(JoinChannelResponse.class);
	}

	/**
	 * 
	 * @param args
	 */
	public String getChannelIdBasedOnChannelName(String channelName)
	{
		ChannelListResponse channelListResponse=getChannelsListRequest();
		ChannelListResponse.Channel channelList=channelListResponse.new Channel();
		String channelId="";
		System.out.println("passed channel name"+channelName);
		for(int i=0;i<channelListResponse.getChannels().size();i++)
		{
			channelList=channelListResponse.getChannels().get(i);
			if(channelList.getName().contentEquals(channelName))
			{
				channelId=channelListResponse.getChannels().get(i).getId();
				break;
			}
		}
		return channelId;
	}
	
	public boolean findPresenceOfChannel(String channelName)
	{
		boolean found=false;
		ChannelListResponse channelListResponse=getChannelsListRequest();
		ChannelListResponse.Channel channelList=channelListResponse.new Channel();
		for(int i=0;i<channelListResponse.getChannels().size();i++)
		{
			channelList=channelListResponse.getChannels().get(i);
			if(channelList.getName().contentEquals(channelName))
			{
				found=true;
				break;
			}
		}
		return found;
	}
	public static void main(String []args)
	{
		ChannelsActions channels=new ChannelsActions();
////		CreateChannelResponse createChannelResponse=channels.postCreateChannelRequest("automation_group2", "xoxp-1096622540018-1081890381575-1100001052162-2a220b4852866221cfe987576b9445d4");	
////		Assert.assertEquals(createChannelResponse.getOk().booleanValue(),true);
//		ChannelListResponse channelListResponse=channels.getChannelsListRequest("xoxp-1096622540018-1081890381575-1100001052162-2a220b4852866221cfe987576b9445d4");
//		Assert.assertEquals(channelListResponse.getOk().booleanValue(), true);
//		ChannelListResponse.Channel channelList=channelListResponse.new Channel();
//		int i=channelListResponse.getChannels().indexOf("testbyui");
//		String group_id=channelListResponse.getChannels().get(i).getId();
//		JoinChannelResponse joinChannelResponse=channels.postJoinChannelsRequest("testbyui", "xoxp-1096622540018-1081890381575-1100001052162-2a220b4852866221cfe987576b9445d4");	
//		Assert.assertEquals(joinChannelResponse.getOk().booleanValue(), true);
//		CreateChannelResponse createChannelResponse2=channels.postReanameChannelRequest(group_id,"3rd_group", "xoxp-1096622540018-1081890381575-1100001052162-2a220b4852866221cfe987576b9445d4");
//		Assert.assertEquals(createChannelResponse2.getOk().booleanValue(), true);
//		
//		for(i=0;i<channelListResponse.getChannels().size();i++)
//		{
//			channelList=channelListResponse.getChannels().get(i);
//			
//			if(channelList.getName().contentEquals("3rd_group"))
//			{
//				group_id=channelListResponse.getChannels().get(i).getId();
//				System.out.println("channel is renamed");
//				break;
//			}
//		}
//		Response response=channels.postArchiveChannelsRequest("group_id", "xoxp-1096622540018-1081890381575-1100001052162-2a220b4852866221cfe987576b9445d4");
//		Assert.assertEquals(response.getBody().jsonPath().getBoolean("ok"), true);
		
	}
	



}
