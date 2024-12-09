package tech.cspioneer.tech.oneblog.utils;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
public class MarkdownToHtmlUtil {
    public static String convertMarkdownToHtml(String markdown) {
            Parser parser = Parser.builder().build();
            Node document = parser.parse(markdown);
            HtmlRenderer renderer = HtmlRenderer.builder().build();
            return renderer.render(document);
          }


}
