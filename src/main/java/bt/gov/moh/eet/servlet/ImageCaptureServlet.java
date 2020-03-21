package bt.gov.moh.eet.servlet;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Poojan Sharma on 21-Mar-20.
 */
@WebServlet(name = "/ImageCaptureServlet")
public class ImageCaptureServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doAction(request, response);
    }

    protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        List<Webcam> webcams = Webcam.getWebcams();
        WebcamUtils.capture(webcams.get(1), "test2", "jpg");
        byte[] bytes = WebcamUtils.getImageBytes(webcams.get(1), "jpg");
        System.out.println("Bytes length: " + bytes.length);
        ServletOutputStream out = response.getOutputStream();
        out.write(bytes);
        out.flush();
        out.close();
        webcams.get(1).close();
    }
}
