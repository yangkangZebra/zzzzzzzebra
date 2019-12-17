package com.yk.demo.utils;


/**
 * pulsar 管理客户端工具，用于管理租户、命名空间、主题
 */
public abstract class PulsarClientAdminUtil {
//	private static final String DEFAULT_SERVICE_HTTP_URL = "http://10.51.10.1:9990";// url 地址，具体视项目而定
//	private static final String[] DEFAULT_ALLOW_CLUSTERS = { "pulsarcluster", "pulsar-cluster456" };// 集群名称，多集群可以用逗号隔开，具体视项目而定
//	private static final String SCHEME = "persistent://";
//	private static final String RESOURCE_SPLIT = "/";
//	private static final Set<String> allowClusters = new HashSet<>(Arrays.asList(DEFAULT_ALLOW_CLUSTERS));
//	private static PulsarAdmin pulsarAdmin;// admin 客户端
//	static {
//		try {
//			pulsarAdmin = PulsarAdmin.builder().serviceHttpUrl(DEFAULT_SERVICE_HTTP_URL).build();
//		} catch (PulsarClientException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 创建租户
//	 * 
//	 * @param tenant
//	 *            租户
//	 */
//	public static void createTenant(String tenant) {
//		createTenant(tenant, allowClusters);
//	}
//
//	/**
//	 * 创建租户
//	 * 
//	 * @param tenant
//	 *            租户
//	 * @param allowClusters
//	 *            允许访问的集群列表, 多集群架构下，如果未指定，默认只能访 问当前集群下的数据
//	 */
//	public static void createTenant(String tenant, Set<String> allowClusters) {
//		TenantInfo tenantInfo = new TenantInfo();
//		tenantInfo.setAllowedClusters(allowClusters);
//		try {
//			pulsarAdmin.tenants().createTenant(tenant, tenantInfo);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 删除租户
//	 * 
//	 * @param tenant
//	 *            租户
//	 */
//	public static void delTenant(String tenant) {
//		try {
//			pulsarAdmin.tenants().deleteTenant(tenant);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 获取租户列表
//	 */
//	public static List<String> listTenants() {
//		try {
//			return pulsarAdmin.tenants().getTenants();
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 创建命名空间
//	 * 
//	 * @param tenant
//	 *            租户
//	 * @param namespace
//	 *            命名空间
//	 */
//	public static void createNamespace(String tenant, String namespace) {
//		try {
//			pulsarAdmin.namespaces().createNamespace(tenant + RESOURCE_SPLIT + namespace);
//			pulsarAdmin.namespaces().setNamespaceReplicationClusters(tenant + RESOURCE_SPLIT + namespace,
//					allowClusters);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 删除命名空间
//	 * 
//	 * @param namespace
//	 *            命名空间
//	 */
//	public static void delNamespace(String tenant, String namespace) {
//		try {
//			pulsarAdmin.namespaces().deleteNamespace(tenant + RESOURCE_SPLIT + namespace);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 获取命名空间列表
//	 */
//	public static List<String> listNamespaces(String tenant) {
//		try {
//			return pulsarAdmin.namespaces().getNamespaces(tenant);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 创建主题
//	 * 
//	 * @param tenant
//	 *            租户
//	 * @param namespace
//	 *            命名空间
//	 * @param topic
//	 *            主题名
//	 * @param partitionNum
//	 *            分区数
//	 */
//	private static void createTopic(String tenant, String namespace, String topic, Integer partitionNum) {
//		try {
//			pulsarAdmin.topics().createPartitionedTopic(
//					SCHEME + tenant + RESOURCE_SPLIT + namespace + RESOURCE_SPLIT + topic, partitionNum);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 删除主题 如果有订阅正在消费主题，删除会失败
//	 * 
//	 * @param tenant
//	 *            租户
//	 * @param namespace
//	 *            命名空间
//	 * @param topic
//	 *            主题名
//	 */
//	private static void delTopic(String tenant, String namespace, String topic) {
//		try {
//			pulsarAdmin.topics().delete(SCHEME + tenant + RESOURCE_SPLIT + namespace + RESOURCE_SPLIT + topic);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	/**
//	 * 获取 topic 列表
//	 * 
//	 * @param tenant
//	 * @param namespace
//	 * @return
//	 */
//	public static List<String> listTopics(String tenant, String namespace) {
//		try {
//			return pulsarAdmin.topics().getPartitionedTopicList(tenant + RESOURCE_SPLIT + namespace);
//		} catch (PulsarAdminException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println("............start create");
//		// createTenant("test-t",allowClusters);
//		// createNamespace("test-t","my-ns");
//		// createTopic("test-t", "my-ns", "my-topic", 3);
//		// System.out.println(listTopics("test-t", "my-ns"));
//		System.out.println("............create successful");
//	}
}