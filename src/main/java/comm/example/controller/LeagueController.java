package comm.example.controller;

import comm.example.model.League;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
@WebServlet("/add_league.do")
public class LeagueController extends HttpServlet {
    private Logger logger=Logger.getLogger("LeagueController.class");
    private League league=null;
    private List<String> errMessage;
    private String leagueName;
    private Integer leagueYear;
    private String leagueSeason;
    @Override
    public void init() throws ServletException {
       logger.info("initialized servlet >> LeagueController");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processesRequest(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processesRequest(req,resp);
    }
    protected void processesRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        errMessage=new ArrayList<String>();
        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        leagueName=req.getParameter("league_name");
        if (leagueName.length()<=0)
        {
            errMessage.add("league name can not be blank.");
        }
        try {
            leagueYear=Integer.parseInt(req.getParameter("league_year"));
        }
        catch (Exception e)
        {
            errMessage.add("league year must be numeric.");
        }
        leagueSeason=req.getParameter("league_season");
        if (leagueSeason.equals("Unknown"))
        {
            errMessage.add("league season can not be unknown.");
        }
        if (!errMessage.isEmpty())
        {
            req.setAttribute("ERROR",errMessage);
            RequestDispatcher dispatcher=req.getRequestDispatcher("WEB-INF/error_page.jsp");
            dispatcher.forward(req,resp);
        }
        else
        {
            league=new League(leagueName,leagueYear,leagueSeason);
            req.setAttribute("LEAGUE",league);
            RequestDispatcher dispatcher=req.getRequestDispatcher("WEB-INF/success_page.jsp");
            dispatcher.forward(req,resp);
        }

    }
}
