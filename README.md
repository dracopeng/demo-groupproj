# demo-groupproj
This is for documenting my progress for group project.

### Spotbugs Issue #1518
[False negatives on RV_01_TO_INT](https://github.com/spotbugs/spotbugs/issues/1518)

**Assigned to:** xinp2@
  
**Reason for choosing this issue:** The Spotbugs project looks very useful to me. Since this issue seemed to have a false negative case, I thought this might be an good start to get familiar with the code base.

**Progress summary:**
For the first a few weeks, I was struggled with my computer set up. I was using Windows and it was not very convenient for coding. 

I started by building a preliminary client for the `S3TransferManager` to ensure that I understand how it should work. This code would eventually transition to the unit tests. I also setup a [localstack](https://github.com/localstack/localstack) environment that would serve as an alternate S3 endpoint for testing. Given that this capability didn't exist yet in version 2 of the AWS SDK for Java, I went and looked at version 1 to see how it was done there. I found a deprecated method for `setEndpoint(String endpoint)` in [AmazonWebServiceClient](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-core/src/main/java/com/amazonaws/AmazonWebServiceClient.java), which seemed promising at first. I also found another deprecated method with the same signature in [AmazonS3Client](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/AmazonS3Client.java). I searched through the `SdkDefaultClientBuilder`, `SdkClientConfiguration`, and `ClientOverrideConfiguration` to see if there were placed where I might be able to override the endpoint. I found an `endpointOverride(URI endpointOverride)` method inside the `SdkDefaultClientBuilder` class, which seemed promising. However, I discovered that the `S3TransferManager` isn't built on this client and instead uses the [CRT-based HTTP client](https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/http-configuration-crt.html), which is in a different repository. At this point, I decided I would move to another issue.

**Tests Written:** Source code for the preliminary client can be found in this [repository](https://github.com/heeki/SampleJavaSdkV2).
