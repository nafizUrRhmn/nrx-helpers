import com.bbl.util.ecutil.model.UserCredentials;
import com.bbl.util.ecutil.model.VerificationBody;
import com.bbl.util.ecutil.model.requesttoken.CredentialResponse;
import com.bbl.util.ecutil.model.result.ResultResponse;
import com.bbl.util.ecutil.model.verification.FingerUploadUrls;
import com.bbl.util.ecutil.model.verification.VerificationResponse;
import com.bbl.util.enums.HeaderContentType;
import com.bbl.util.utils.HttpHelperUtil;

import java.util.HashMap;
import java.util.List;

public class EcUtil {
    private HttpHelperUtil httpHelperUtil;

    public EcUtil(HttpHelperUtil httpHelperUtil) {
        this.httpHelperUtil = httpHelperUtil;
    }

    //first call

    public CredentialResponse requestForToken(UserCredentials userCredentials, String loginUrl) {
        return httpHelperUtil.httpPostCall(loginUrl, userCredentials, CredentialResponse.class, HeaderContentType.APPLICATION_JSON, null, null);
    }

    //    // second call
    VerificationResponse requestForVerificationPath(VerificationBody verificationBody, String accessToken, String verificationUrl) {
        VerificationResponse verificationResponse =
                httpHelperUtil.httpPostCall(verificationUrl, verificationBody, VerificationResponse.class, HeaderContentType.APPLICATION_JSON, accessToken, null);
        return verificationResponse;
    }

    public void fingerDataUpload(List<FingerUploadUrls> fingerUploadUrls, HashMap<String, byte[]> fingers) {
        for (FingerUploadUrls urlObj : fingerUploadUrls) {
            httpHelperUtil.httpPutCall(urlObj.getUrl(), null, String.class, HeaderContentType.OCTET_STREAM, null, fingers.get(urlObj.getFinger()));
        }
    }

    public ResultResponse resultCheck(String resultUrl, String token) {
        ResultResponse resultResponse = httpHelperUtil.httpGetCall(resultUrl, token, HeaderContentType.APPLICATION_JSON, ResultResponse.class);
        return resultResponse;
    }

}
