# flake8: noqa

# import all models into this package
# if you have many models here with many references from one model to another this may
# raise a RecursionError
# to avoid this, import only the models that you directly need like:
# from from fds.sdk.FactSetPortfolioOptimizer.model.pet import Pet
# or import this package, but before doing it, use:
# import sys
# sys.setrecursionlimit(n)

from fds.sdk.FactSetPortfolioOptimizer.model.account_directories import AccountDirectories
from fds.sdk.FactSetPortfolioOptimizer.model.account_directories_root import AccountDirectoriesRoot
from fds.sdk.FactSetPortfolioOptimizer.model.calculation_info import CalculationInfo
from fds.sdk.FactSetPortfolioOptimizer.model.calculation_info_root import CalculationInfoRoot
from fds.sdk.FactSetPortfolioOptimizer.model.client_error_response import ClientErrorResponse
from fds.sdk.FactSetPortfolioOptimizer.model.currency import Currency
from fds.sdk.FactSetPortfolioOptimizer.model.currency_root import CurrencyRoot
from fds.sdk.FactSetPortfolioOptimizer.model.document_directories import DocumentDirectories
from fds.sdk.FactSetPortfolioOptimizer.model.document_directories_root import DocumentDirectoriesRoot
from fds.sdk.FactSetPortfolioOptimizer.model.error import Error
from fds.sdk.FactSetPortfolioOptimizer.model.error_source import ErrorSource
from fds.sdk.FactSetPortfolioOptimizer.model.fpo_account import FPOAccount
from fds.sdk.FactSetPortfolioOptimizer.model.fpo_optimization_parameters import FPOOptimizationParameters
from fds.sdk.FactSetPortfolioOptimizer.model.fpo_optimization_parameters_root import FPOOptimizationParametersRoot
from fds.sdk.FactSetPortfolioOptimizer.model.object_root import ObjectRoot
from fds.sdk.FactSetPortfolioOptimizer.model.optimal_portfolio import OptimalPortfolio
from fds.sdk.FactSetPortfolioOptimizer.model.optimization import Optimization
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_account_overrides import OptimizerAccountOverrides
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_optimal_holdings import OptimizerOptimalHoldings
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_output_types import OptimizerOutputTypes
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_strategy import OptimizerStrategy
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_strategy_overrides import OptimizerStrategyOverrides
from fds.sdk.FactSetPortfolioOptimizer.model.optimizer_trades_list import OptimizerTradesList
from fds.sdk.FactSetPortfolioOptimizer.model.pa_doc import PaDoc
